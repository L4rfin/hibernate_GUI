package entity;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "transaction", schema = "bank_gui", catalog = "")
public class TransactionEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "accountIds")
    private int accountIds;
    @Basic
    @Column(name = "outAccountId")
    private int outAccountId;
    @Basic
    @Column(name = "inAccountId")
    private int inAccountId;
    @Basic
    @Column(name = "outSum")
    private double outSum;
    @Basic
    @Column(name = "inSum")
    private double inSum;
    @Basic
    @Column(name = "provision")
    private double provision;
    @Basic
    @Column(name = "operationDate")
    private Timestamp operationDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAccountIds() {
        return accountIds;
    }

    public void setAccountIds(int accountIds) {
        this.accountIds = accountIds;
    }

    public int getOutAccountId() {
        return outAccountId;
    }

    public void setOutAccountId(int outAccountId) {
        this.outAccountId = outAccountId;
    }

    public int getInAccountId() {
        return inAccountId;
    }

    public void setInAccountId(int inAccountId) {
        this.inAccountId = inAccountId;
    }

    public double getOutSum() {
        return outSum;
    }

    public void setOutSum(double outSum) {
        this.outSum = outSum;
    }

    public double getInSum() {
        return inSum;
    }

    public void setInSum(double inSum) {
        this.inSum = inSum;
    }

    public double getProvision() {
        return provision;
    }

    public void setProvision(double provision) {
        this.provision = provision;
    }

    public Timestamp getOperationDate() {
        return operationDate;
    }

    public void setOperationDate(Timestamp operationDate) {
        this.operationDate = operationDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TransactionEntity that = (TransactionEntity) o;

        if (id != that.id) return false;
        if (accountIds != that.accountIds) return false;
        if (outAccountId != that.outAccountId) return false;
        if (inAccountId != that.inAccountId) return false;
        if (Double.compare(outSum, that.outSum) != 0) return false;
        if (Double.compare(inSum, that.inSum) != 0) return false;
        if (Double.compare(provision, that.provision) != 0) return false;
        if (operationDate != null ? !operationDate.equals(that.operationDate) : that.operationDate != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id;
        result = 31 * result + accountIds;
        result = 31 * result + outAccountId;
        result = 31 * result + inAccountId;
        temp = Double.doubleToLongBits(outSum);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(inSum);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(provision);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (operationDate != null ? operationDate.hashCode() : 0);
        return result;
    }
}
